package kata4;

public class HistogramBuilder<E> {
    
    private E[] items;

    public HistogramBuilder(E[] items) {
        this.items = items;
    }
    
    public <A> Histogram <A> build(AtributeExtractor<E,A> extractor){
        Histogram histogram = new Histogram<>();
        for (E item : items) {
            histogram.put(item, histogram.get(item) + 1);
        }
        return histogram;
    }   

}
