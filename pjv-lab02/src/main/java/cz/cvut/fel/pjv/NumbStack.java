package cz.cvut.fel.pjv;

public class NumbStack{
    Double[] stack ;


    public NumbStack(Double[] stack) {
        this.stack = stack;

    }

    public Double GetPrumer(){
        Double sum = 0.0;

        int cnt = 0;

        for(Double d : stack){
            if(d != null){
                sum += d;
                cnt++;
            }
        }

    return sum / cnt;
    }
    public Double GetPopulValues(){
        Double prumer = GetPrumer();
        Double sum = 0.0;

        int cnt = 0 ;
        for(Double d : stack){
            if(d != null) {
                sum += Math.pow(d - prumer, 2);
                cnt ++;
            }
        }
        return  Math.sqrt(sum / cnt);
    }
}
