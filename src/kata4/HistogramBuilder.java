package kata4;

public class HistogramBuilder<E> {
    
    private E[] items;

    public HistogramBuilder(E[] items) {
        this.items = items;
    }
    
    public Histogram build(){
        Histogram histogram = new Histogram<>();
        for (E item : items) {
            histogram.put(item, histogram.get(item) + 1);
        }
        return histogram;
    }   

}
