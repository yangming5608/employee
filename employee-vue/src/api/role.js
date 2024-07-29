import request from '@/utils/request'


export default {
    //1.查询
    getRoleByClerkId(id) {
      return request({
        url: `/employee/role/getRoleByClerkId/${id}`,
        method: "get"
      })
    },
    //修改
    uodateRoleByClerkId(clerkId,managementInfo) {
      return request({
        url: `/employee/role/uodateRoleByClerkId/${clerkId}/${managementInfo}`,
        method: "put",
      })
    },
    getAdminList(){
        return request({
            url: `/employee/role/getAdminList`,
            method: "get",
          })
    }
  }

