class demo{
    private int num;
    
    void input(int x){
        num =x;
    }

    demo obj(){

        demo l = new demo();
        l.num = 4*num;
        return l;
    }
    void show(){
        System.out.println("num = "+num);
    }

}

class pass_rtn_obj {

    public static void main(String args[]) {
        
        demo d1 = new demo();
        d1.input(5);
        demo d2 = d1.obj();
        d1.show();
        d2.show();

    }
}