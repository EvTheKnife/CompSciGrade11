import pygame as pg


WIDTH = 1200
HEIGHT = 720
SCREEN_SIZE = (WIDTH, HEIGHT)



pg.init()

main_font = pg.font.SysFont('Fira Code Light', 30)

screen = pg.display.set_mode(SCREEN_SIZE)

clock = pg.time.Clock()

run = True



class Player():
    def __init__(self) -> None:
        player_x = WIDTH / 2
        player_y = HEIGHT / 2
        player_size = (SCREEN_SIZE / 5)

        player_rect = pg.Rect(player_x, player_y, player_size)


class ChoiceBox():
    def __init__(self, text_to_display: str, pos: tuple) -> None:
        self.text_surface = main_font.render(text_to_display, 1, (0, 0, 0))

        if pos[0] == pos[1] == 0:
            self.box_x = WIDTH / 4
            self.box_y = HEIGHT / 4
        
        if pos[0] == 0 and pos[1] == 1:
            self.box_x = WIDTH / 4
            self.box_y = (HEIGHT / 4) + HEIGHT / 2 
        
        if pos[0] == 1 and pos[1] == 0:
            self.box_x = (WIDTH / 4) + WIDTH / 2 
            self.box_y = HEIGHT / 4

        if pos[0] == 1 and pos[1] == 1:
            self.box_x = (WIDTH / 4) + WIDTH / 2 
            self.box_y = (HEIGHT / 4) + HEIGHT / 2 



box_1 = ChoiceBox("Hello, world 0", (0, 0))
box_2 = ChoiceBox("Hello, world 1", (1, 0))
box_3 = ChoiceBox("Hello, world 2", (0, 1))
box_4 = ChoiceBox("Hello, world 3", (1, 1))



while run:

    for event in pg.event.get():
        if event.type == pg.QUIT:
            run = False
        if event.type == pg.KEYDOWN:
            if event.key == pg.K_ESCAPE:
                pg.quit()
                


    screen.fill("white")

    screen.blit(box_1.text_surface, (box_1.box_x, box_1.box_y))
    screen.blit(box_2.text_surface, (box_2.box_x, box_2.box_y))
    screen.blit(box_3.text_surface, (box_3.box_x, box_3.box_y))
    screen.blit(box_4.text_surface, (box_4.box_x, box_4.box_y))


    pg.display.update()
    clock.tick(60)



pg.quit()