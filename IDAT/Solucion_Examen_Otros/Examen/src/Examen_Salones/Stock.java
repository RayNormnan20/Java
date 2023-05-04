package Examen_Salones;

import java.util.Date;

public class Stock {

    private int stockId;
    private String name;
    private Date lastdate;
    private int benchmarkId;
    
    public  Stock(){
        
    }

    public Stock(int stockId, String name, Date lastdate, int benchmarkId) {
        this.stockId = stockId;
        this.name = name;
        this.lastdate = lastdate;
        this.benchmarkId = benchmarkId;
    }

    public int getStockId() {
        return stockId;
    }

    public void setStockId(int stockId) {
        this.stockId = stockId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getLastdate() {
        return lastdate;
    }

    public void setLastdate(Date lastdate) {
        this.lastdate = lastdate;
    }

    public int getBenchmarkId() {
        return benchmarkId;
    }

    public void setBenchmarkId(int benchmarkId) {
        this.benchmarkId = benchmarkId;
    }

    
}
