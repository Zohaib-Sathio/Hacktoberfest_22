// Add st, nd, rd and th suffix to a number

function nth(n){ 
    let nstr = n.toString(); 
    let pf = '';  
    let i = 0;
    let l = 2;
    if(n < 0){
        i = 1;
        l = 3;
    }

    if(nstr[i] == '1' && nstr.length == l){
        pf = 'th';
    }
    if(!pf){
        let n = nstr[nstr.length-1]       
        switch(n){
            case '1' : pf = 'st';
                break;
            case '2' : pf = 'nd';
                break;
            case '3' : pf = 'rd';
                break;
            default : pf = 'th';
        }
    }
    
    return nstr+pf;
    
}