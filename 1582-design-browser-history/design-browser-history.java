class BrowserHistory {

    Stack<String> forw = new Stack<>();
    Stack<String> backw = new Stack<>();
     String curr;
    public BrowserHistory(String homepage) {
         curr = homepage;
    }
    
    public void visit(String url) {
        backw.push(curr);
        curr = url;
        forw.clear();
    }
    
    public String back(int steps) {
        while(steps>0 && !backw.isEmpty()){
            forw.push(curr);
            curr = backw.peek();
            backw.pop();
            steps--;

        }
        return curr;
    }
    
    public String forward(int steps) {
        while(steps>0 && !forw.isEmpty()){
            backw.push(curr);
            curr = forw.peek();
            
            forw.pop();
            steps--;
        }

         return curr;

    }
   
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */