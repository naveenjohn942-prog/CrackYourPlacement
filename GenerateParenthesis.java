class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        
        helper(0,0,"",n,res);
        return res;
    }
    void helper(int open,int close,String str,int n,List<String> res){
        if(open==n&&close==n){
            res.add(str);
            return;
        }
        if(open<n){
            helper(open+1,close,str+"(",n,res);
        }
        if(close<open){
            helper(open,close+1,str+")",n,res);
        }
    } 
}
