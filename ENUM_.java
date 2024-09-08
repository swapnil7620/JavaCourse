// enum ENUM_ {

//    KF, RC, OC, MD, RS;
//        public static void main(String[] args) {
//         ENUM_ E = ENUM_.RS;
//         System.out.println(E);

//     }

// }

/*----------Switch vs Enum-------- */
/* 
enum ENUM_ {

    KF, RC, OC, MD, RS;
    public static void main(String[] args) {
        ENUM_ E = ENUM_.KF;
        // System.out.println(E);
 
        switch (E) {
            case KF:
                System.out.println("KingFisher It is not that much kick  : " + E.KF);
                break;
            case RC:
                System.out.println("Royal Challange is good : " + E.RC);
                break;
            case OC:
                System.out.println("Officer Choice Average : " + E.OC);
                break;
            case MD:
                System.out.println("Mac'Donals is My Favorite : " + E.MD);
                break;
            case RS:
                System.out.println("Royal Stag is Best suitable : "+ E.RS);
                   break;
            default:
                System.out.println("Other Brand is not good");
                break;
        }

    }

}
*/
/*-----------Enum vs Inheritance---------- */

/* Inheritance is not applicable for Enum  */

/*---------Values() Method-------- */

// enum ENUM_ {
// //will get error
//        KF, RC, OC, MD, RS;
//        class Test{
//            public static void main(String[] args) {
//             ENUM_ []E = ENUM_.values();
//             for (ENUM_ E1 : E) {

//                 System.out.println(E1);
//             }
//             }

//         }

//     }

/*
 enum Beer {
    KF, KO, RC, FO;
}

class TestE {
    public static void main(String args[]) {
        Beer[] b = Beer.values();
        for (Beer b1 : b)// this is forEach loop.
        {
            System.out.println(b1 + "......." + b1.ordinal()  );
        }
    }
}
 */

/*---------Enum VS Constructor------ */
/* 
enum Beer {
     KF, KO, RC, FO;

    Beer() {
        System.out.println("Constructor called." );
    }
}

class ENUM_ {
    public static void main(String args[]) {
        // Beer b = Beer.KF;
        // Beer b1 = Beer.RC;
        System.out.println("hello.");
    }
}
    */
/* 
enum Beer {
    KF(100), KO(70), RC(65), Fo(90), RS;

    int price;

    Beer(int price) {
        this.price = price;
    }

    Beer() {
        this.price = 125;//for default value
    }

    public int getPrice() {
        return price;
    }

}

class ENUM_ {
    public static void main(String args[]) {
        Beer[] b = Beer.values();
        for (Beer b1 : b) {
            System.out.println(b1 + "......." + b1.getPrice());
        }
    }
}
*/