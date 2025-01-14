public class Calculator {
    private boolean switchButton;
    //constructor
    Calculator(){
        this.switchButton=false;
    }
    public void toggle(){
        this.switchButton=!this.switchButton;
    }
    public boolean getStatus(){
        return this.switchButton;
    }

    public static void main(String[] args) {
        /*
        static is a type of instruction we cant create multiple copies
        ex: calculator factory  1 person who can fix it (any new calc is broken. it passed to that fixer he can fix it )
         */
        Calculator obj=new Calculator();
        obj.toggle();
        System.out.println(obj.getStatus());
    }
}
