package demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import org.w3c.dom.ls.LSOutput;

/**
 * @author ly
 * @version 1.0
 * @date 2020/10/31 9:29 下午
 * @company 红尘互娱创意文化
 */
public class SingleMode {


//  private SingleMode(){
//
//  }

//  private static final SingleMode singleMode=new SingleMode();
//
//  public SingleMode getInstance(){
//    return singleMode;
//  }

  public static SingleMode getInstance(){
    return SingleEnum.INSTANCE.getInstance();
  }


  public static void main(String[] args) {
    ExecutorService executorService= Executors.newFixedThreadPool(10);
    while (true){
      executorService.execute(new Runnable() {
        @Override
        public void run() {

          System.out.println("线程名称==="+ Thread.currentThread().getName());
          SingleMode singleMode=SingleMode.getInstance();

          System.out.println(singleMode);
        }
      });
    }



  }
}
