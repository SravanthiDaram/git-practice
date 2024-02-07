package OOPs_20th_Jan_2024;


public class Bank {
    private String currency;
    private Integer amount;


    public String getCurrency(){
        return currency;
    }
    public void setCurrency(){
        this.currency = currency;
    }

    public Integer getAmount(){
        return amount;
    }
    public void setAmount(){
        this.amount = amount;
    }

    public Bank(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public Integer add(Bank bankname) throws customexception{
        if(!(bankname.currency.equalsIgnoreCase("INR"))){
            throw new customexception("USD to INR not supported");

        }
        Integer sum = this.amount+ bankname.amount;
        return sum;
    }
}
