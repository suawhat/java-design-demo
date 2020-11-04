package demo.桥梁模式;

/**
 * @author ly
 * @version 1.0
 * @date 2020/11/4 5:09 下午
 * @company 红尘互娱创意文化
 */
public abstract class Company {

  private final Product product;

  public Company(Product product){
    this.product=product;
  }

  public void makeMoney(){
    this.product.producted();
    this.product.selled();
  }

}
