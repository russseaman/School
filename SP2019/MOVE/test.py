import valve.source.a2s

SERVER_ADDRESS = ('37.10.127.166',27015)

with valve.source.a2s.ServerQuerier(SERVER_ADDRESS, timeout=60.0) as server:
    info = server.info()
    players = server.players()

print("{player_count}/{max_players} {server_name}".format(**info))
# for player in sorted(players["players"],
#                      key=lambda p: p["score"], reverse=True):
#     print("{score} {name}".format(**player))
print("{name}".format(**player))
