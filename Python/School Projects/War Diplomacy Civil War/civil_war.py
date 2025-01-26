import pygame
import sys

# Initialize Pygame
pygame.init()

# Set constants
CONFEDERATE_COLOR = (122, 141, 158)
UNION_COLOR = (59, 77, 150)

CONFEDERATE_HAT_PATH = "Python/School Projects/War Diplomacy Civil War/Assets/ConfedHat.png"
UNION_HAT_PATH = "Python/School Projects/War Diplomacy Civil War/Assets/UnionHat.png"

MUSKET_PATH = "Python/School Projects/War Diplomacy Civil War/Assets/Musket.png"


# pygame.image.load("/Assets/ConfedHat.png")
# pygame.image.load("/Assets/Musket.png")

# Set up display
width, height = 1800, 1200
screen = pygame.display.set_mode((width, height))
pygame.display.set_caption("Civil War Project")

# Set up the clock
clock = pygame.time.Clock()

# Create Player class
class Player(pygame.sprite.Sprite):
    def __init__(self, pos, img, *groups):
        super().__init__(*groups)
        self.image = pygame.image.load(img).convert_alpha()
        self.rect = self.image.get_rect()



# Create Player object
p1 = Player((250, 250), UNION_HAT_PATH)

# Main game loop
running = True
while running:
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False

    # Fill the screen with black
    screen.fill((0, 0, 0))

    screen.blit(p1.image, p1.rect)

    # Update the display
    pygame.display.flip()

    # Cap the framerate
    clock.tick(60)

# Quit Pygame
pygame.quit()
sys.exit()