package cz.cvut.fel.pjv;

//package cz.cvut.fel.pjv;





public class Lab02 {




    private void homework() {



        int line_cnt = 0;
        TextIO io = new TextIO();
        String line;
        Double[] stack = new Double[10];

        int cnt = 0;
        while ((line = io.getLine()) != null) {
            line_cnt++;
            if (line.equals("")) {
                System.err.println("End of input detected!");
                if(cnt > 1) {
                    NumbStack ns = new NumbStack(stack);
                    String s = String.format("%2d %.3f %.3f", cnt, ns.GetPrumer(), ns.GetPopulValues());
                    System.out.println(s);
                }

                cnt = 0;
                break;
            }
            if (TextIO.isInteger(line)) {
                stack[cnt] = (double)Integer.parseInt(line);
                cnt++;
            } else if (TextIO.isFloat(line)) {
                stack[cnt] = (double)Float.parseFloat(line);
                cnt++;
            } else if (TextIO.isDouble(line)) {
                stack[cnt] = Double.parseDouble(line);
                cnt++;
            } else {
                System.err.println("A number has not been parsed from line " + line_cnt);
            }


            if(cnt == 10){
                NumbStack ns = new NumbStack(stack);
                String s = String.format("10 %.3f %.3f", ns.GetPrumer(), ns.GetPopulValues());
                System.out.println(s);
                cnt = 0;
                stack = new Double[10];
            }
        }

    }
   public void start(String[] args) {
        homework();

   }
}
