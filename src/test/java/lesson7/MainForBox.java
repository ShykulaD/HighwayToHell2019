package lesson7;

public class MainForBox {


    public static void main(String[] args) {

        Box mybox = new Box() ; // создать объект mybox класса Вох
        Box cube = new Box() ; // создать объект cube класса Вох
        Box parallelepiped = new Box() ; // создать объект parallelepiped класса Вох


        cube.setDim(10,10,10);
        parallelepiped.volume();


        }

    }
}
