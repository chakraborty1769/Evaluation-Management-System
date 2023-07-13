const CountDownTimer = function(divid, timeinterval){
    
    
    // Set the date we're counting down to
    // time interval is in second
    var countDownTime = new Date().getTime() + timeinterval*1000;
    // countDownTime.setSeconds(countDownTime.getSeconds() + timeinterval);
    // console.log('count down called');
    
    // Update the count down every 1 second
    var x = setInterval(function() {

    // Get today's date and time
        var now = new Date().getTime();
        // console.log(now);
        // Find the distance between now and the count down date
        var distance = countDownTime - now;
        // console.log(distance);
        // Time calculations for days, hours, minutes and seconds
        var days = Math.floor(distance / (1000 * 60 * 60 * 24));
        var hours = Math.floor((distance % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60));
        var minutes = Math.floor((distance % (1000 * 60 * 60)) / (1000 * 60));
        var seconds = Math.floor((distance % (1000 * 60)) / 1000);
        // console.log(minutes + ' : ' + seconds);
        // Display the result in the element with id="demo"
        // document.getElementById("demo").innerHTML = days + "d " + hours + "h "
        // + minutes + "m " + seconds + "s ";
        // minutes = (minutes < 10) ? ('0' +minutes) : minutes;
        // seconds = (seconds < 10) ? ('0' +seconds) : seconds;
        $('#'+divid).html(((minutes < 10) ? ('0' +minutes) : minutes) + ' : ' + ((seconds < 10) ? ('0' +seconds) : seconds));
        // If the count down is finished, write some text
        if (distance < 1) {
            
            clearInterval(x);
            $('#'+divid).html('');
            // document.getElementById("demo").innerHTML = "EXPIRED";
        }
    }, 1000);

}