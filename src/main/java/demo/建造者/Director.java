package demo.建造者;

import java.util.ArrayList;

/**
 * @author ly
 * @version 1.0
 * @date 2020/10/31 11:48 下午
 * @company 红尘互娱创意文化
 */
public class Director {

  private final ArrayList<String> sequence=new ArrayList<>();
  private final BenzBuilder benzBuilder=new BenzBuilder();

  public BenzModel getBenzModel(){
    this.sequence.clear();
    this.sequence.add("start");
    this.sequence.add("stop");
    this.benzBuilder.setSequence(sequence);
    return (BenzModel) this.benzBuilder.getCarModel();
  }


  public static void main(String[] args) {
    Director d=new Director();
    BenzModel benzModel= d.getBenzModel();
    benzModel.run();
  }

}
