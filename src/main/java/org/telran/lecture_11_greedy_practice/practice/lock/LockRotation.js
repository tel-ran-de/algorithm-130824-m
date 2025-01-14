
function minRotation(input, unlockCode) {
    let rotation = 0;
    let input_digit, code_digit;

    // iterate till input and unlock code become 0
    while (input > 0 || unlockCode > 0) {
        // input and unlock last digit as reminder
        input_digit = input % 10;
        code_digit = unlockCode % 10;
        // find min rotation
        rotation += Math.min(Math.abs(input_digit - code_digit),
            10 - Math.abs(input_digit - code_digit));
        // update code and input
        input = Math.floor(input / 10);
        unlockCode = Math.floor(unlockCode / 10);
    }
    return rotation;
}