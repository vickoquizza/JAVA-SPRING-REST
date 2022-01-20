public class block{

  public static void main(String args[]){

    int[] blocks = {3,4,2,4,2};
    int sumOfNumbers = 0;
    int nReference = 0;
    int differenceBlock = 0;
    int sumOfBlocks = 0;

    for(int i = 0; i < blocks.length; i++){
      sumOfNumbers += blocks[i];
    }

    nReference = sumOfNumbers / blocks.length;

    for(int i = 0; i < blocks.length; i++){
      if((nReference - blocks[i]) > 0){
          differenceBlock = nReference - blocks[i];
          blocks[i] += differenceBlock;
      }else if((nReference - blocks[i]) < 0){
          differenceBlock = blocks[i] - nReference;
          blocks[i] -= differenceBlock;
          sumOfBlocks += differenceBlock;
      }
      System.out.print(" " + blocks[i]);
    }


      System.out.println(" La cantidad de bloques movidos fue " + sumOfBlocks);

  }
}
