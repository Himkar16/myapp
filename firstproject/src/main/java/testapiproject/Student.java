package testapiproject;

import testapiproject.Appconfigg;
import testapiproject.resourceclass;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class Student extends Application<Appconfigg>{
    public static void main(String[] args)throws Exception {
//        for (int i = 1; i <= 100; i++) {
//            System.out.println(i);
//        }
        new Student().run(args);
        return ;
    }
    @Override
    public void run(Appconfigg config, Environment env) {
        final resourceclass rs = new resourceclass();
        env.jersey().register(rs);

    }

}
