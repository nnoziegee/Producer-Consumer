/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nozipho_tenele.resource;

/**
 *
 * @author nnozi
 */
import java.util.concurrent.Semaphore;

public class MyQueue {

    private int student;
    private Semaphore semaphoreConsumer;
    private Semaphore semaphoreProducer;

    public MyQueue() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         * 4: aload_0
         * 5: new           #7                  // class java/util/concurrent/Semaphore
         * 8: dup
         * 9: iconst_0
         * 10: invokespecial #9                  // Method java/util/concurrent/Semaphore."<init>":(I)V
         * 13: putfield      #12                 // Field semaphoreConsumer:Ljava/util/concurrent/Semaphore;
         * 16: aload_0
         * 17: new           #7                  // class java/util/concurrent/Semaphore
         * 20: dup
         * 21: iconst_1
         * 22: invokespecial #9                  // Method java/util/concurrent/Semaphore."<init>":(I)V
         * 25: putfield      #18                 // Field semaphoreProducer:Ljava/util/concurrent/Semaphore;
         * 28: return
         *  */
        // </editor-fold>
    }

    public void get() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #12                 // Field semaphoreConsumer:Ljava/util/concurrent/Semaphore;
         * 4: invokevirtual #21                 // Method java/util/concurrent/Semaphore.acquire:()V
         * 7: goto          19
         * 10: astore_1
         * 11: getstatic     #26                 // Field java/lang/System.out:Ljava/io/PrintStream;
         * 14: ldc           #32                 // String InterruptedException caught
         * 16: invokevirtual #34                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
         * 19: getstatic     #26                 // Field java/lang/System.out:Ljava/io/PrintStream;
         * 22: new           #40                 // class java/lang/StringBuilder
         * 25: dup
         * 26: invokespecial #42                 // Method java/lang/StringBuilder."<init>":()V
         * 29: ldc           #43                 // String Consumer consumed item :
         * 31: invokevirtual #45                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 34: aload_0
         * 35: getfield      #49                 // Field student:I
         * 38: invokevirtual #53                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
         * 41: invokevirtual #56                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 44: invokevirtual #34                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
         * 47: aload_0
         * 48: getfield      #18                 // Field semaphoreProducer:Ljava/util/concurrent/Semaphore;
         * 51: invokevirtual #60                 // Method java/util/concurrent/Semaphore.release:()V
         * 54: return
         * Exception table:
         * from    to  target type
         * 0     7    10   Class java/lang/InterruptedException
         *  */
        // </editor-fold>
    }

    public void put(int student) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #18                 // Field semaphoreProducer:Ljava/util/concurrent/Semaphore;
         * 4: invokevirtual #21                 // Method java/util/concurrent/Semaphore.acquire:()V
         * 7: goto          19
         * 10: astore_2
         * 11: getstatic     #26                 // Field java/lang/System.out:Ljava/io/PrintStream;
         * 14: ldc           #32                 // String InterruptedException caught
         * 16: invokevirtual #34                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
         * 19: aload_0
         * 20: iload_1
         * 21: putfield      #49                 // Field student:I
         * 24: getstatic     #26                 // Field java/lang/System.out:Ljava/io/PrintStream;
         * 27: new           #40                 // class java/lang/StringBuilder
         * 30: dup
         * 31: invokespecial #42                 // Method java/lang/StringBuilder."<init>":()V
         * 34: ldc           #63                 // String Producer produced Student :
         * 36: invokevirtual #45                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 39: iload_1
         * 40: invokevirtual #53                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
         * 43: invokevirtual #56                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 46: invokevirtual #34                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
         * 49: aload_0
         * 50: getfield      #12                 // Field semaphoreConsumer:Ljava/util/concurrent/Semaphore;
         * 53: invokevirtual #60                 // Method java/util/concurrent/Semaphore.release:()V
         * 56: return
         * Exception table:
         * from    to  target type
         * 0     7    10   Class java/lang/InterruptedException
         *  */
        // </editor-fold>
    }
}