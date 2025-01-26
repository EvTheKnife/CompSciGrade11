def main(n, str1, str2):

    firstLetter = str1[0]
    try:
        k = str2.index(firstLetter)
        front = str2[k:len(str2)]
        end = str2[0:k]
        full = front + end
        if str1 == full:
            print('CYCLE')
        else:
            print('NO CYCLE')
    except:
        print('NO CYCLE')
    
   

if __name__ == "__main__":
    main(3, "ABC", "BCA")
