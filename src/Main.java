public class Main {
    public static void main(String[] args) {


        System.out.println(!(!(!(false ^ false) || (true && true))));
        //falso^falso=Falso|| true&&true= Vero
        //!not di Falso=Vero|| Vero= Vero
        //Vero||Vero=Vero
        //! di Vero=Falso
        //! di Falso=Vero
        //soluzione: Vero


        int x=3;
        int y=2;
        System.out.println( !((x * y) <= 6) && (x - y != 1));
        //3*2=6 è uguale a 6=Vero && 3-2=1 quindi==1 e non !=1 quindi Falso
        // ! davanti la prima parentesi diventa da Vero a Falso
        //Falso&&Falso=Falso
        //soluzione= Falso
        




    }
}