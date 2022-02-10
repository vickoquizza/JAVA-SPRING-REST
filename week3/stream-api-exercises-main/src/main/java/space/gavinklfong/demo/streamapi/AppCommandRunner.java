package space.gavinklfong.demo.streamapi;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import space.gavinklfong.demo.streamapi.models.Customer;
import space.gavinklfong.demo.streamapi.models.Order;
import space.gavinklfong.demo.streamapi.models.Product;
import space.gavinklfong.demo.streamapi.repos.CustomerRepo;
import space.gavinklfong.demo.streamapi.repos.OrderRepo;
import space.gavinklfong.demo.streamapi.repos.ProductRepo;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@Slf4j
@Component
public class AppCommandRunner implements CommandLineRunner {

	@Autowired
	private CustomerRepo customerRepos;
	
	@Autowired
	private OrderRepo orderRepos;
	
	@Autowired
	private ProductRepo productRepos;

	@Transactional
	@Override
	public void run(String... args) throws Exception {
		List<Product> booksLessThan100 = productRepos.findAll().stream()
				.filter(product -> product.getCategory().equals("Books"))
				.filter(product -> product.getPrice() > 100)
				.collect(Collectors.toList());

		log.info("Books that have a price less than 100: ");
		booksLessThan100
				.forEach(p -> log.info(p.toString()));

		List<Order> orderWithBabyProducts = orderRepos.findAll().stream()
				.filter(order -> order
						.getProducts()
						.stream()
						.anyMatch(product -> product.getCategory().equals("Baby")))
				.collect(Collectors.toList());

		log.info("Orders with a baby product, at least ");
		orderWithBabyProducts
				.forEach(p -> log.info(p.toString()));

		List<Product> productsWithTenPercent = productRepos.findAll().stream()
				.filter(p -> p.getCategory().equals("Toys"))
				.map(p -> p.withPrice(p.getPrice() * 0.9))
				.collect(Collectors.toList());

		log.info("Products with ten percent discount ");
		productsWithTenPercent
				.forEach(p -> log.info(p.toString()));

		List<Product> customerTier2BetweenFebandMarch = orderRepos.findAll().stream()
				.filter(order -> order.getCustomer().getTier() == 2)
				.filter(order -> order.getOrderDate().compareTo(LocalDate.of(2021,2,1)) >= 0)
				.filter(order -> order.getOrderDate().compareTo(LocalDate.of(2021,4,1)) <= 0)
				.flatMap(order -> order.getProducts().stream())
				.distinct()
				.collect(Collectors.toList());

		log.info("Products asked by tier 2 customers between 2021/02/01 to 2021/04/01");
		customerTier2BetweenFebandMarch
				.forEach(p -> log.info(p.toString()));

		Optional<Product> cheapestBooks = productRepos.findAll().stream()
				.filter(p -> p.getCategory().equals("Books"))
				.sorted(Comparator.comparing(p -> p.getPrice()))
				.findFirst();

		log.info("Cheapest book");
		log.info(cheapestBooks.toString());

		List<Order> last3Orders = orderRepos.findAll().stream()
				.sorted(Comparator.comparing(Order::getOrderDate).reversed())
				.limit(3)
				.collect(Collectors.toList());

		log.info("Last 3 orders placed");
		last3Orders
				.forEach(p -> log.info(p.toString()));


	log.info("Orders placed on 15-03-2021");
		List<Product> productsOrderedOn15042021 = orderRepos.findAll().stream()
				.filter(order -> order.getOrderDate().isEqual(LocalDate.of(2021, 03, 15)))
				.peek(System.out::println)
				.flatMap(order -> order.getProducts().stream())
				.collect(Collectors.toList());


		double sumOfPricesFromOrderOfFebruary = orderRepos.findAll().stream()
				.filter(order -> order.getOrderDate().compareTo(LocalDate.of(2021,2,1)) >= 0)
				.filter(order -> order.getOrderDate().compareTo(LocalDate.of(2021,4,1)) <= 0)
				.flatMap(order -> order.getProducts().stream())
				.mapToDouble(product -> product.getPrice())
				.sum();

		log.info("Sum of amounts made on february 2021");
		log.info(String.valueOf(sumOfPricesFromOrderOfFebruary));

		double averagePaymentsAt15Mar2021 = orderRepos.findAll().stream()
				.filter(order -> order.getOrderDate().isEqual(LocalDate.of(2021, 03,15)))
				.flatMap(order -> order.getProducts().stream())
				.mapToDouble(products -> products.getPrice())
				.average().getAsDouble();

		log.info("Average paymaent made on 15-mar-2021");
		log.info(String.valueOf(averagePaymentsAt15Mar2021));

		DoubleSummaryStatistics statistics = productRepos.findAll().stream()
				.filter(product -> product.getCategory().equals("Books"))
				.mapToDouble(product -> product.getPrice())
				.summaryStatistics();

		log.info("Sumary statistics from all books");
		System.out.println(String.format("count = %1$d, average = %2$f, max = %3$f, min = %4$f, sum = %5$f",
				statistics.getCount(), statistics.getAverage(), statistics.getMax(), statistics.getMin(), statistics.getSum()));

		Map<Long, Integer> orderIdandCount = orderRepos.findAll().stream()
				.collect(Collectors.toMap(
						order -> order.getId(),
						order -> order.getProducts().size()
				));

		Map<Customer, List<Order>> orderRecordsGroupedByCustomer = orderRepos.findAll().stream()
				.collect(Collectors.groupingBy(Order::getCustomer));

		Map<Order, Double> orderRecordAndTotalSum = orderRepos.findAll().stream()
				.collect(Collectors.toMap(
						Function.identity(),
						order -> order.getProducts().stream()
								.mapToDouble(product -> product.getPrice())
								.sum()
				));

		Map<String, List<String>> orderProductsByCategory = productRepos.findAll().stream()
				.collect(Collectors.groupingBy(Product::getCategory
						, Collectors.mapping(product -> product.getName(), Collectors.toList())));

		Map<String, Optional<Product>> eachExpensiveProductByCategory = productRepos.findAll().stream()
				.collect(Collectors.groupingBy(Product::getCategory
						, Collectors.maxBy(Comparator.comparing(Product::getPrice))));
	}



}
