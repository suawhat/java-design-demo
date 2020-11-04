package demo.建造者;

import java.util.ArrayList;

/**
 * @author ly
 * @version 1.0
 * @date 2020/10/31 11:44 下午
 * @company 红尘互娱创意文化
 */
public class BenzBuilder extends AbstractCarBuilder{
  private final BenzModel benzModel=new BenzModel();
  @Override
  public void setSequence(ArrayList<String> sequence) {
    this.benzModel.setSequence(sequence);
  }

  @Override
  public CarModel getCarModel() {
    return this.benzModel;
  }
}
