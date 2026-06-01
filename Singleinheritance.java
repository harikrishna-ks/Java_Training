public class Singleinheritance {
    public static void main(String[] args){
        class a{
            String name;
            void display(){
                System.out.println("Name: "+name);
            }
            void str(){
                System.out.print("Nothing");
            }
        }
        class b extends a{
            void hide(){
                display();
                str();
            }
        }class c extends b{
            void run(){
                System.out.println("Running");
            }
        }
        a obj = new a();
        obj.name = "Hari";
        obj.display();
        b obj1 = new b();
        obj1.name = "krishna    ";
        obj1.hide();
        c obj2 = new c();
        obj2.name = "Ram";
        obj2.hide();
        obj2.run();
    }
    
}

