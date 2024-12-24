package ProblemSovling;

public class TowerOfHanoi {
    //    public static void main(String[] args) {
//        Integer noOfDisks=4;
//        moveDisk(noOfDisks,1,2,3);
//    }
//
//    private static void moveDisk(Integer noOfDisks, int sourcePole, int buffer, int targetPole) {
//        Integer currentDisk=1;
//        while (noOfDisks>currentDisk){
//            System.out.println("moving current Disk "+currentDisk+" from "+sourcePole+" to "+buffer);
//            System.out.println("moving current Disk "+currentDisk+" from "+sourcePole+" to "+buffer);
//        }
//    }
    public static void move(int disks, int source, int auxiliary, int target) {
        if (disks > 0) {
            // move `n-1` discs from source to auxiliary using the target
            // as an intermediate pole
            move(disks - 1, source, target, auxiliary);

            // move one disc from source to target
            System.out.println("Move disk " + disks + " from " + source + " —> " +
                    target);

            // move `n-1` discs from auxiliary to target using the source
            // as an intermediate pole
            move(disks - 1, auxiliary, source, target);
        }
    }

    // Tower of Hanoi Problem
    public static void main(String[] args) {
        int n = 4;
        move(n, 1, 2, 3);
    }
}
