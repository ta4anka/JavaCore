package net.proselyte.javacore.Schildt.Chapter_8;

class RefDemo {//-----------------------------------
    public static void main(String args[]) {
        BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
        Box plainbox = new Box();
        double vol;

        vol = weightbox.volume();
        System.out.println("Volume of weightbox is " + vol);
        System.out.println("Weight of weightbox is " + weightbox.weight);
        System.out.println();

// assign BoxWeight reference to Box reference
        plainbox = weightbox;  // ===> !!!!!!!!
        vol = plainbox.volume(); // OK, volume() defined in Box
        System.out.println("Volume of plainbox is " + vol);

/* The following statement is invalid because plainbox
does not define a weight member. */
//        System.out.println("Weight of plainbox is " + plainbox.weight);

    }
}//----------------------------------------------------
/*
Here, weightbox is a reference to BoxWeight objects, and plainbox is a reference to Box
objects. Since BoxWeight is a subclass of Box, it is permissible to assign plainbox a reference
to the weightbox object.
 */