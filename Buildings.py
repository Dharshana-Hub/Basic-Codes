num = [1, 2, 3, 8, 4]
great = num[0]
build = []
for i in range(5):
    if great<=num[i]:
        great=num[i]
        build.append(great)
print(build)