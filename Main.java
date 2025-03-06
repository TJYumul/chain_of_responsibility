public class Main {
    public static void main(String[] args) {
        WasteCollector organic = new OrganicCollector();
        WasteCollector recyclable = new RecyclableCollector();
        WasteCollector hazardous = new HazardousCollector();

        organic.setNextCollector(recyclable);
        recyclable.setNextCollector(hazardous);

        WasteContainer[] containers = {
                new WasteContainer("Organic", 75),
                new WasteContainer("Recyclable", 40),
                new WasteContainer("Hazardous", 25),
                new WasteContainer("Plastic", 15)
        };

        System.out.println("Starting Waste Collection Process...");
        for (WasteContainer container : containers) {
            organic.collect(container);
        }
    }
}
