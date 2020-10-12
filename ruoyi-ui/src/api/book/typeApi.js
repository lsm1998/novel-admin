import request from '@/utils/request'

// 查询分类列表
export function listType(query) {
  return request({
    url: '/type/list',
    method: 'get',
    params: query
  });
}

export function addType(data) {
  return request({
    url: '/type',
    method: 'post',
    data: data
  });
}

export function changeStatus(id, status) {
  const data = {
    id,
    status
  };
  return request({
    url: '/type/status',
    method: 'post',
    data: data
  });
}
