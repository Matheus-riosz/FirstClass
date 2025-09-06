public class Ebook extends  Livro {
   private String watermark;

   public Ebook(Autor autor){
       super(autor);
   }
   @Override
public boolean aplicarDesconto(double porcetagem){
       if (porcetagem >15){
           System.out.println("Não é possivel dar desconto maior que 15%");
           return false;
       }
       return super.aplicarDescontoDe(porcetagem);
   }

    public String getWatermark() {
        return watermark;    }

    public void setWatermark(String watermark) {
        this.watermark = watermark;
    }
}
