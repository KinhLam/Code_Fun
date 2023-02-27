#nhập chuỗi
print('Nhập các số nguyên trong danh sách ! Nhập "x" nếu muốn ngưng việc nhập.')
chuoi = []
while True:
    so = input()
    if so == 'x':
        break;
    else:
        so = int(so)
        chuoi.append(so)

def sap_xep_tang_dan (chuoi):
    for i in range (len(chuoi)):
        for x in range (i+1,len(chuoi),1):
            if chuoi[x] < chuoi[i]:
                n = chuoi[x]
                chuoi[x] = chuoi[i]
                chuoi[i] = n
    return chuoi

def sap_xep_giam_dan (chuoi):
    for i in range (len(chuoi)):
        for x in range (i+1, len(chuoi),1):
            if chuoi[x] > chuoi[i]:
                n = chuoi[x]
                chuoi[x] = chuoi[i]
                chuoi[i] = n
    return chuoi

sap_xep = input('Bạn muốn sắp xếp danh sách thế nào. Tăng dần (Nhập I) hay giảm dần (Nhập D)?\n')

print('\nDanh sách sau khi được sắp xếp !')

if sap_xep == 'I' or 'i':
    print(sap_xep_tang_dan(chuoi))
elif sap_xep == 'D' or 'd':
    print(sap_xep_giam_dan(chuoi))
else:
    print("Error!")