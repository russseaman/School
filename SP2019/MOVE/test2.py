import logging

from gevent.pool import Pool
from valve.source.master_server import MasterServerQuerier
from valve.source.a2s import ServerQuerier, NoResponseError
from valve.source.messages import BrokenMessageError

MASTER_HOST = '37.10.127.166'
MASTER_TIMEOUT = 60
SERVER_TIMEOUT = 5

pool = Pool(size=50)

address = ('37.10.127.166',27015)

def get_server_stats(address):
    server = ServerQuerier(address, timeout=SERVER_TIMEOUT)
    try:
        info = server.info()

        logging.info(u'Updated {0}:{1} | {player_count}/{max_players} |  {server_name} | {map} | {server_type}'.format(
            address[0], address[1], **info)
        )
        return True
    except (NotImplementedError, NoResponseError, BrokenMessageError):
        pass

if __name__ == '__main__':
    logging.basicConfig(level=logging.INFO)

    results = get_server_stats(address)

    # logging.info('Counting results...')
    # results = [result.get() for result in results]

    # logging.info('Collected {0}'.format(len(results)))
