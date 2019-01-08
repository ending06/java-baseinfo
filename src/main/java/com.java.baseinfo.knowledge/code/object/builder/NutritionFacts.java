package com.java.baseinfo.knowledge.code.object.builder;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2019/1/8<p>
// 当属性比较多的时候，又需要进行参数验证时，建议用builder模式
// -------------------------------------------------------

public class NutritionFacts {

    private final int servings;

    private final int servingSize;

    private final int fat;

    private final int caloris;

    private final int sodium;

    public NutritionFacts(Builder builder) {
        servings = builder.servings;
        servingSize = builder.servingSize;
        fat = builder.fat;
        caloris = builder.caloris;
        sodium = builder.sodium;
    }

    public static class Builder {
        private final int servings;

        private final int servingSize;

        private final int fat = 0;

        private final int caloris = 0;

        private final int sodium = 0;

        public Builder(int servings, int servingSize) {
            this.servings = servings;
            this.servingSize = servingSize;
        }

        public Builder fat(int fat){
            fat = fat;
            return this;
        }

        public Builder caloris(int caloris){
            caloris = caloris;
            return this;
        }

        public Builder sodium(int sodium){
            sodium = sodium;
            return this;
        }
        public NutritionFacts build(){
            return new NutritionFacts(this);
        }
    }

    public int getServings() {
        return servings;
    }

    public int getServingSize() {
        return servingSize;
    }

    public int getFat() {
        return fat;
    }

    public int getCaloris() {
        return caloris;
    }

    public int getSodium() {
        return sodium;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("NutritionFacts{");
        sb.append("servings=").append(servings);
        sb.append(", servingSize=").append(servingSize);
        sb.append(", fat=").append(fat);
        sb.append(", caloris=").append(caloris);
        sb.append(", sodium=").append(sodium);
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
        NutritionFacts nutritionFacts = new NutritionFacts.Builder(240,8).caloris(100).sodium(35).caloris(27).build();
        System.out.printf("===>"+nutritionFacts);
    }
}