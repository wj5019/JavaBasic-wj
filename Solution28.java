class Solution:
    def uncommonFromSentences(self, A: str, B: str) -> List[str]:
        d, result = {}, []
        for word in A.split(' ') + B.split(' '):
            d[word] = d.get(word, 0) + 1
        for k, v in d.items():
            if v == 1:
                result.append(k)
        return result
