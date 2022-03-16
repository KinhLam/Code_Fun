from turtle import *
s = Screen()
s.setup(550,600,330.10)
s.delay(30)
up() #Không xe khi di chuyển
shape('square')
shapesize(2,4,4)
fillcolor('#ea5b33')
sviengach=s.textinput('?','Bao nhiêu viên ?')
x,y,sh = -240, -280 ,0
for i in range(int(sviengach)):
    goto(x,y)
    stamp()
    x+=80
    if x>300:
        y+=40
        sh+=1
        if sh%2==0:
            x=-240
        else:
            x=-280
done()
