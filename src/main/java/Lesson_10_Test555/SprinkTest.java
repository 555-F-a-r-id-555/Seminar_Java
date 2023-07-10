package Lesson_10_Test555;


public class SprinkTest<T extends Test02> {


    public FuitBox2<T> copyAndRemove(FuitBox2<T> sourceBox) {
        FuitBox2<T> newBox = new FuitBox2<>();

        for (T fruit : sourceBox) {
            newBox.addFruits(fruit);
        }

            sourceBox.clear(sourceBox);

        return newBox;
    }


//    private FuitBox2<T> newfuitBox2;
//
//    public SprinkTest() {
//        newfuitBox2 = new FuitBox2<>();
//    }
//
//    public FuitBox2 sprinkTest2(FuitBox2<T> fuitBox2){
//
//        newfuitBox2 = new FuitBox2<>();
//        for (T elem:fuitBox2) {
//            newfuitBox2.addFruits(elem);
//        }
//
////        fuitBox2.remove();
//        return newfuitBox2 ;
//    }
}

