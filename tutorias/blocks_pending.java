public class blocks_pending{

        private int[] wall = new int[] {3,4,2,4,2};

        public static void main(String[] args) {
            ej1 ej1 = new ej1();

            System.out.println(ej1.biggestColum());

            int biggestCo = ej1.biggestColum();

            int sum = ej1.wallSize(biggestCo);

            System.out.println(sum);

        }

        /*

        public int blocksAmount() {
            int blockAmount = 0;
            for (int i = 0; i < wall.length; i++){
                blockAmount += wall[i];
            }
            return blockAmount;
        }

         */

        /*
        public int getAvg(int blockAmount) {
            return blockAmount / wall.length;
        }

         */

        public int biggestColum() {
            int bigColumn = 0;
            for (int i = 0; i < wall.length; i++) {
                for (int j = 0; j < wall.length; j++) {
                    if (wall[i] > wall[j]) {
                        bigColumn = wall[i];
                    }
                }
            }
            return bigColumn;
        }

        public int wallSize(int blockAvg) {
            int blocksPending = 0;
            int difference = 0;
            for (int i = 0 ; i < wall.length; i++) {
                if (wall[i] < blockAvg) {
                    difference = Math.abs(wall[i] - blockAvg);
                    blocksPending += difference;
                }
            }
            return blocksPending;
        }

    }

