class Solution {
    /**
     * @param {number[][]} matrix
     * @return {void}
     */
    rotate(matrix) {
        for(let i=0; i<matrix.length; i++){
            for(let j=i ; j<matrix[i].length; j++){
                let temp = matrix[i][j]
                matrix[i][j] = matrix[j][i]
                matrix[j][i] = temp
            }
        }
        for(let i=0; i<matrix.length; i++){
            let start = 0
            let end = matrix[i].length-1

            while(start<end){
                let temp = matrix[i][start]
                matrix[i][start] = matrix[i][end]
                matrix[i][end] = temp
                start++
                end--
            }
        }
    }
}
