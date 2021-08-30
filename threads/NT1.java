class NT1 {
    public static void main(String[] args) {
        Thread gnit = Thread.currentThread();
        System.out.println("Glavna nit: " + gnit + '\n' + "Pauza od 5 sekundi");
        try {
            gnit.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Prekid niti");
        }
        gnit.setName("Glavna");
        System.out.println("Glavna nit: " + gnit + '\n' + "Naziv glavne niti: " + gnit.getName());
    }
}