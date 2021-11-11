package MTTQuestions;

import java.util.*;
class Mobile{
    HashMap<String, ArrayList<String>> mobiles = new HashMap<>();
    String addMobile(String company, String model){
        String c = company;
        String m = model;
        if(mobiles.containsKey(c)){
            ArrayList<String> strs = new ArrayList<String>();
            strs = mobiles.get(c);
            strs.add(m);
            mobiles.put(c, strs);
        }else{
            ArrayList<String> strs = new ArrayList<String>();
            strs.add(m);
            mobiles.put(c, strs);
        }
        return "model successfully added";
    }

    ArrayList<String> getModels(String company){
        return mobiles.get(company);
    }

    String buyMobile(String company, String model){
        if(mobiles.containsKey(company)){
            ArrayList<String> strs = new ArrayList<String>();
            strs = mobiles.get(company);
            strs.remove(model);
            mobiles.put(company, strs);
        }else{
            ArrayList<String> strs = new ArrayList<String>();
            strs.remove(model);
            mobiles.put(company, strs);
        }
        return "mobile sold successfully";
    }
    public static void main(String arr[]){
        Mobile obj = new Mobile();

        System.out.println(obj.addMobile("Oppo","K3"));
        System.out.println(obj.getModels("Oppo"));
        System.out.println(obj.buyMobile("Oppo","K3"));
    }
}
