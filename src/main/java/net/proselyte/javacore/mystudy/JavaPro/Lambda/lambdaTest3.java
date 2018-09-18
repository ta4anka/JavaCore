package net.proselyte.javacore.mystudy.JavaPro.Lambda;

@FunctionalInterface
interface Executable {
    void execute();
}

// this class requires instance of interface Executable
class Runner {
    public void run(Executable e){
        e.execute();
        }
}
// --------3 ways of interface implementation-----------

// 1st way ==> create class:
class ExecutableImplementation implements Executable{
    @Override
    public void execute() {
        System.out.println("1st way by create whole class");
    }
}

public class lambdaTest3 {
    public static void main(String[] args) {

        Runner runner = new Runner();

        //1st way:
        runner.run(new ExecutableImplementation());

        // 2nd way ==> by using Anonymous class:
        runner.run(new Executable() {
            @Override
            public void execute() {
                System.out.println("2nd way by using Anonymous class");
            }
        });

        //3rd way --> by lambda:
        runner.run(() -> System.out.println("3rd way by lambda"));
    }
}
