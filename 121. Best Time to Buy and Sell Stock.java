class Solution {
    public int maxProfit(int[] prices) {
        int lsp = Integer.MAX_VALUE;
        int op=0;
        int psod=0;
        for(int i=0;i<prices.length;i++){
            if(lsp>prices[i]){
                lsp=prices[i];
            }
            psod = prices[i]-lsp;
            if(op<psod){
                op=psod;
            }


        }
        return op;
    }
}
