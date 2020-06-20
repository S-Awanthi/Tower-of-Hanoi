
public class TowerHanoi {
    //Function for insert 3 towers
    public void puzzle(int n,String start,String aux, String end){
        if(n == 1)
        {
            System.out.println("Move disk " +n+ ", from " +start+ " to " +end);
        }
        else
        {
            puzzle(n-1, start, end, aux);
            System.out.println("Move disk " +n+ ", from " +start+ " to " +end);
            puzzle(n-1, aux, start,end);
        }
    }
    
    public static void main(String[] args) {
        TowerHanoi move = new TowerHanoi();
        
        move.puzzle(2, "rod A", "rod B", "rod C");
    }
}
