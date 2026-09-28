/**
 * @param {string} s
 * @return {number}
 */
var maxDepth = function(s) {
    let count=0;
    let max=0;
    let n=s.length;
    for(let i=0;i<n;i++)
    {
        let ch=s[i];
        if(ch=='(')
        {
            count++;
            max=Math.max(count,max);
        }
        else if(ch==')')
        count--;
    }
    return max;
    
};