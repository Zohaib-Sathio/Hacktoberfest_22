def islands(arr: list) -> int:
    '''Outputs number of connected islands'''
    h, w = len(arr), len(arr[0])
    visited = [[False] * w for _ in range(h)]
    get_neighbour = lambda cor: max(min(cor[0] + cor[1], cor[2] - 1), 0)
    islands = 0
    for y in range(h):
        for x in range(w):
            if arr[y][x] == "#" and not visited[y][x]:
                stack = [(y, x)]
                while stack:
                    Y, X = stack.pop()
                    if visited[Y][X]:
                        continue
                    visited[Y][X] = True
                    for xx, yy in ((1, 0), (-1, 0), (0, 1), (0, -1)):
                        YY, XX = map(get_neighbour, ((yy, Y, h), (xx, X, w)))
                        if arr[YY][XX] == "#":
                            stack.append((YY, XX))
                islands += 1

    return islands