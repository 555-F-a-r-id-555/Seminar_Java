package Lesson_09_DZ;

import java.util.Comparator;

public class ContainerCountComparator implements Comparator<Container> {

    @Override
    public int compare(Container container1, Container container2) {
        return Integer.compare(container1.sizeContainer(), container2.sizeContainer());
    }

   /* @Override
    public int compare(Container container1, Container container2) {
        if (container1.sizeContainer() > container2.sizeContainer()) {
            return 1;
        } else if (container1.sizeContainer() < container2.sizeContainer()) {
            return -1;
        } else {
            return 0;
        }
    }*/


}

//public class ContainerCountComparator implements Comparable<Container> {
//
//    private int count;
//    private Container container;
//
//    public ContainerCountComparator(Container container) {
//        this.container = container;
//        this.count = container.sizeContainer();
//    }
//
//    @Override
//    public int compareTo(Container o) {
//        if (this.count > o.sizeContainer()) return 1;
//        if (this.count < o.sizeContainer()) return -1;
//        return 0;
//    }
//
//}
